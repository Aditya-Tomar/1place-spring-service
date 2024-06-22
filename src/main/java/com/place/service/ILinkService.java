package com.place.service;


import com.place.model.Link;

import java.util.List;

public interface ILinkService {

    List<Link> addUpdateLink(String userId, List<Link> links);

    Boolean deleteLinkById(String userId, String linkId);

}
