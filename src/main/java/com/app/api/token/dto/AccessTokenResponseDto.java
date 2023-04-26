package com.app.api.token.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @Setter @Builder
public class AccessTokenResponseDto {

    @Schema(description = "grantType", example = "Bearer", required = true)
    private String grantType;

    @Schema(description = "accessToken", example = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyasdfasdgasdfXQiOjE2ODI0NzI5NjEsImhhgsdg2MSwibWVtYmVySWQiOjEsInJvbGUiOiJBRE1JTiJ9.A6QPalpYL2FDQUc9CrXKBtkjLn55SjIwCSyvF1sAlgV93KSbUb5FIXsBw02nto4WMzxOz17Nsg0HPwBYcO9EtA", required = true)
    private String accessToken;

    @Schema(description = "access token 만료 시간", example = "2023-04-26 10:51:01", required = true)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Seoul")
    private Date accessTokenExpireTime;
}
