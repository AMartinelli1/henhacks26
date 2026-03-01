package adm.model;

import adm.model.Node;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class NodesController {

    @RequestMapping(value = "/api/nodes", method = RequestMethod.GET)
    public List<Node> getNodes() {
        return Arrays.asList(
                new Node("SMCM_N1", 38.1876629,-76.4302757, "Dorchester Hall", "1"),
                new Node("SMCM_N2", 38.9825, -76.4823, "CALVERT", "1"),
                new Node("SMCM_N3", 38.9830, -76.4828, "GLENDENNING", "1"),
                new Node("SMCM_N4", 38.9835, -76.4832, "DORCHESTER", "2")
        );
    }
}