package com.llxk.xkapicommon.service;

/**
* @author llxk
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-08-26 15:58:56
*/
public interface InnerUserInterfaceInfoService{


    /**
     * 调用接口统计
     * @param interfaceInfoId 接口id
     * @param userId 用户id
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);


}
