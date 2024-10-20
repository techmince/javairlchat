package com.jchat.server.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChangeRoomNameRequest {
    Integer id;
    String newName;
}
