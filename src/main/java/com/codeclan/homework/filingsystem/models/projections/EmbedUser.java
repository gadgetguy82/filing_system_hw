package com.codeclan.homework.filingsystem.models.projections;

import com.codeclan.homework.filingsystem.models.Folder;
import com.codeclan.homework.filingsystem.models.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedUser", types = Folder.class)
public interface EmbedUser {
  String getTitle();
  User getUser();
}
