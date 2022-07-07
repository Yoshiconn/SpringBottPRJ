package kopo.poly.controller;

import kopo.poly.dto.UserinfoDTO;
import kopo.poly.service.IUserinfoService;
import kopo.poly.util.CmmUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
public class UserinfoController {

    @Resource(name = "UserinfoService")
    private IUserinfoService userinfoService;

    @GetMapping(value = "userinfoindex")
    public String UserinfoindexPage() throws Exception {
        log.info(getClass().getName() + "Userinfoindex Start!!");
        log.info(getClass().getName() + "Userinfoindex End!!");

        return "userinfoindex";
    }
    @GetMapping(value = "userinfo")
    public String UserinfoPage() throws Exception {
        log.info(getClass().getName() + "UserinfoPage Start!!");
        log.info(getClass().getName() + "UserinfoPage End!!");

        return "userinfoform";
    }
    @PostMapping(value = "getInsertuserinfo")
    public String getInsertuserinfo (HttpServletRequest request, Model model) throws Exception {
        log.info(this.getClass().getName() + " .getuserinfo start !!");
        String user_id = CmmUtil.nvl(request.getParameter("user_id"));
        String user_pwd = CmmUtil.nvl(request.getParameter("user_pwd"));
        String user_email = CmmUtil.nvl(request.getParameter("user_email"));
        String user_name = CmmUtil.nvl(request.getParameter("user_name"));

        log.info("user_id : " + user_id);
        log.info("user_pwd : " + user_pwd);
        log.info("user_email : " + user_email);
        log.info("user_name : " + user_name);

        UserinfoDTO pDTO = new UserinfoDTO();
        pDTO.setUser_id(user_id);
        pDTO.setUser_pwd(user_pwd);
        pDTO.setUser_email(user_email); // 서비스에 편하게 담으려고 만듬
        pDTO.setUser_name(user_name); // 서비스에 편하게 담으려고 만듬

        int res = userinfoService.InsertUserinfo(pDTO); // 객체. <- .은 접근자 이다. noticeService 안에 있는 InsertNoticeInfo 를 사용할수 있다.
        //저장되면 1의 값을 안되면 0의 값을 가져옴
        String msg;
        String url = "/userinfo";

        if (res > 0) {
            msg = "등록에 성공하셨습니다.";
        } else {
            msg = "등록에 실패하셨습니다.";
        }
        model.addAttribute("msg", msg);
        model.addAttribute("url", url);


        log.info(this.getClass().getName() + " .getuserinfo End !!");
        return "Redirect";
    }
}
