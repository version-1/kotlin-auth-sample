package kintai

/**
 * Created by admin on 2017/05/26.
 */
import java.io.IOException

import javax.servlet.ServletException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


import org.springframework.security.authentication.BadCredentialsException
import org.springframework.security.core.AuthenticationException
import org.springframework.security.web.authentication.AuthenticationFailureHandler

/**
 * Spring Securityの認証失敗時に呼ばれるハンドラクラス
 */
class AuthenticationFailureHandler : AuthenticationFailureHandler {

    @Throws(IOException::class, ServletException::class)
    override fun onAuthenticationFailure(
            httpServletRequest: HttpServletRequest,
            httpServletResponse: HttpServletResponse,
            authenticationException: AuthenticationException) {

        var errorId = ""
        // ExceptionからエラーIDをセットする
        if (authenticationException is BadCredentialsException) {
            errorId = "ERR-0001"
        }

        // ログイン画面にリダイレクト
        httpServletResponse.sendRedirect(httpServletRequest.contextPath + "/index?error=" + errorId)
    }
}