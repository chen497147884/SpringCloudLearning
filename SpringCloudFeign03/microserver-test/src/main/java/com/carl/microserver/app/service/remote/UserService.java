package com.carl.microserver.app.service.remote;

import com.carl.microserver.app.MicroServerUserConstants;
import com.carl.microserver.app.remote.UserRemontRestService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Date: 2018/4/13 9:45
 * @Author: Carl
 */
@FeignClient(value = MicroServerUserConstants.SERVICE_APP_ID)
public interface UserService extends UserRemontRestService {
}
