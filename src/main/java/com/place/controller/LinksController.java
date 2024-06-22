package com.place.controller;

import com.place.model.Link;
import com.place.service.LinkService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/links")
public class LinksController {

    @Autowired
    LinkService service;

    @PostMapping("add/{userId}")
    public ResponseEntity<List<Link>> addUpdateLinks(@PathParam("userId") String userId, @RequestBody() List<Link> links) {
        List<Link> updateLinks = service.addUpdateLink(userId, links);
        return new ResponseEntity<>(updateLinks, HttpStatus.OK);
    }

    @DeleteMapping("delete/{userId}")
    public ResponseEntity<Boolean> deleteLink(@PathParam("userId") String userId, @RequestParam("linkId") String linkId) {
        Boolean deleted = service.deleteLinkById(userId, linkId);
        return new ResponseEntity<>(deleted, HttpStatus.OK);
    }

}
