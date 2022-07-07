package kopo.poly.service;

import kopo.poly.dto.NoticeDTO;
import kopo.poly.dto.UserinfoDTO;

import java.util.List;

public interface IUserinfoService {
    int InsertUserinfo(UserinfoDTO pDTO) throws Exception;
}
