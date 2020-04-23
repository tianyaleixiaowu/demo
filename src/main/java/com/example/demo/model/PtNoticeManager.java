package com.example.demo.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author wuwf
 */
@Service
public class PtNoticeManager {
    @Resource
    private PtNoticeRepository ptNoticeRepository;

    private Page<PtNotice> findAll(Pageable var2) {
        return ptNoticeRepository.findAll(var2);
    }

    public List<PtNotice> findAll() {
        return ptNoticeRepository.findAll();
    }

    public PtNotice find(Long id) {
        return ptNoticeRepository.getOne(id);
    }

    public PtNotice add(PtNotice ptNotice) {
        return save(ptNotice);
    }

    public PtNotice update(PtNotice ptNotice) {
        return save(ptNotice);
    }

    public void delete(PtNotice ptNotice) {
        ptNoticeRepository.delete(ptNotice);
    }

    private PtNotice save(PtNotice ptNotice)  {
        return ptNoticeRepository.save(ptNotice);
    }

}
