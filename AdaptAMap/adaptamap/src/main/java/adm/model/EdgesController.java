package adm.model;

import adm.model.Edge;
import adm.repository.GraphRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EdgesController {

    private final GraphRepository graphRepository;

    public EdgesController(GraphRepository graphRepository) {
        this.graphRepository = graphRepository;
    }

    @RequestMapping(value = "/api/edges", method = RequestMethod.GET)
    public List<Edge> edges() {
        return graphRepository.findEdgesInBox(
                38.979900, 38.981000,
                -76.481000, -76.479000
        );
    }
}