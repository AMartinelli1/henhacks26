from django.contrib import admin
from django.urls import path
from tech.views import translate_text   # 👈 adjust if needed

urlpatterns = [
    path('admin/', admin.site.urls),
    path('translate/', translate_text, name='translate'),
]