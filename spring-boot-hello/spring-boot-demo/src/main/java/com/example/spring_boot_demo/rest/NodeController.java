package com.example.spring_boot_demo.rest;


import com.example.spring_boot_demo.entity.Node;
import com.example.spring_boot_demo.repository.NodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/node")
@RequiredArgsConstructor
public class NodeController {

    private final NodeRepository nodeRepository;

    @GetMapping
    public List<Node> getAllNodes() {
        return nodeRepository.findAll();
    }

    @PostMapping
    public Node createNode(@RequestBody Node node) {
        return nodeRepository.save(node);
    }

    @GetMapping("/{id}")
    public Node getNode(@PathVariable Long id) {
        return nodeRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteNode(@PathVariable Long id) {
        nodeRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void updateNode(@RequestBody Node node, @PathVariable Long id) {
        if (nodeRepository.existsById(id))
            nodeRepository.save(node);
    }
}
