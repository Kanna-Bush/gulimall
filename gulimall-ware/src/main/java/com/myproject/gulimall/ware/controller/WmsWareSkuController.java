package com.myproject.gulimall.ware.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myproject.gulimall.ware.entity.WmsWareSkuEntity;
import com.myproject.gulimall.ware.service.WmsWareSkuService;
import com.myproject.gulimall.common.utils.PageUtils;
import com.myproject.gulimall.common.utils.R;



/**
 * 商品库存
 *
 * @author linkai
 * @email lk644606288@163.com
 * @date 2024-09-08 13:10:05
 */
@RestController
@RequestMapping("ware/wmswaresku")
public class WmsWareSkuController {
    @Autowired
    private WmsWareSkuService wmsWareSkuService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("ware:wmswaresku:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = wmsWareSkuService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("ware:wmswaresku:info")
    public R info(@PathVariable("id") Long id){
		WmsWareSkuEntity wmsWareSku = wmsWareSkuService.getById(id);

        return R.ok().put("wmsWareSku", wmsWareSku);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("ware:wmswaresku:save")
    public R save(@RequestBody WmsWareSkuEntity wmsWareSku){
		wmsWareSkuService.save(wmsWareSku);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("ware:wmswaresku:update")
    public R update(@RequestBody WmsWareSkuEntity wmsWareSku){
		wmsWareSkuService.updateById(wmsWareSku);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("ware:wmswaresku:delete")
    public R delete(@RequestBody Long[] ids){
		wmsWareSkuService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
