package com.jchat.server.response;

import com.jchat.server.enums.RequestStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseResponse {
    RequestStatus status = RequestStatus.SUCCESS;
    String message;
}

