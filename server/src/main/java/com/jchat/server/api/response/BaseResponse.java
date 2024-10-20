package com.jchat.server.api.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseResponse {
    GetRoomsResponse.RequestStatus status = GetRoomsResponse.RequestStatus.SUCCESS;
    String message;
}

