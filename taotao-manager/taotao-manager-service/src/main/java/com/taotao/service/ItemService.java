package com.taotao.service;

import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;

/**
 * @Description
 * @Author ChengXiang
 * @Date 2018/11/4 23:27
 */
//@Service
public interface ItemService {
    TbItem getItemById(Long itemId);
}
