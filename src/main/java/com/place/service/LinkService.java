package com.place.service;


import com.place.common.RedisConfiguration;
import com.place.model.Link;
import com.place.repository.LinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

@Service
public class LinkService implements ILinkService {

    @Autowired
    LinkRepository repository;

    @Autowired
    RedisConfiguration redis;

    @Override
    public List<Link> addUpdateLink(String userId, List<Link> links) {
        redis.set(userId, links.toString());
        return repository.saveAll(links);
    }

    @Override
    public Boolean deleteLinkById(String userId, String linkId) throws NoSuchElementException {
        UUID uuid = getUuid(linkId).orElseThrow();
        repository.deleteById(1);
        return null;
    }

    private Optional<UUID> getUuid(String linkId) {
        try {
            UUID uuid = UUID.fromString(linkId);
            return Optional.of(uuid);
        } catch (Exception ignored) {

        }
        return Optional.empty();
    }
}
