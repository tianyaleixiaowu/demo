package com.example.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author wuweifeng wrote on 2017/10/26.
 */
public interface PtNoticeRepository extends JpaRepository<PtNotice, Long>,
        JpaSpecificationExecutor<PtNotice> {

}
