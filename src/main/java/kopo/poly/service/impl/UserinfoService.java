package kopo.poly.service.impl;

import kopo.poly.dto.NoticeDTO;
import kopo.poly.dto.UserinfoDTO;
import kopo.poly.persistance.mapper.INoticeMapper;
import kopo.poly.persistance.mapper.IUserinfoMapper;
import kopo.poly.service.INoticeService;
import kopo.poly.service.IUserinfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service("UserinfoService") //@을 걸고 서비스에 대한 이름을 정의해줘야만
public class UserinfoService implements IUserinfoService {

    private final IUserinfoMapper userinfoMapper;

    @Autowired // InticeMappe 라는걸 모름 알게 해주기 위해서 사용 resource와 같다고 생각하면됨
    public UserinfoService(IUserinfoMapper userinfoMapper) {
        this.userinfoMapper = userinfoMapper; // 여기서 객체로 만듬
    }

    @Override
    public int InsertUserinfo(UserinfoDTO pDTO) throws Exception {
        log.info(this.getClass().getName() + "InsertUserinfo start !!");
        int res = userinfoMapper.IUserinfoMapper(pDTO);
        log.info(this.getClass().getName() + "InsertUserinfo end !!");
        return res;
    }
}