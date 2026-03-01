import google.generativeai as genai
from django.http import JsonResponse
from django.views.decorators.csrf import csrf_exempt
import json
import re
import os

# 🔐 Use environment variable instead of hardcoding
genai.configure(api_key=os.getenv("GEMINI_API_KEY"))

@csrf_exempt
def translate_text(request):
    if request.method == "POST":

        print("VIEW HIT")

        data = json.loads(request.body)

        texts = data.get("texts", [])
        target_language = data.get("targetLanguage", "English")

        print("TEXTS:", texts)
        print("TARGET:", target_language)

        model = genai.GenerativeModel("gemini-1.5-flash")

        prompt = f"""
        Translate each string in this list into {target_language}.
        Return ONLY a valid JSON array.
        No markdown. No explanation.

        {json.dumps(texts)}
        """

        response = model.generate_content(prompt)

        response_text = response.text.strip()

        print("RAW RESPONSE:", response_text)

        # Remove markdown code fences if Gemini adds them
        response_text = re.sub(r"^```json\s*", "", response_text)
        response_text = re.sub(r"\s*```$", "", response_text)

        try:
            translated = json.loads(response_text)
        except Exception as e:
            print("JSON ERROR:", e)
            translated = texts  # fallback

        return JsonResponse({"translations": translated})

    return JsonResponse({"error": "POST request required"})