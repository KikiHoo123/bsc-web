package com.bsc.modules.section.controller;
import com.bsc.modules.section.entity.Section;
import com.bsc.modules.section.service.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
/**
 * @author YangRui
 */
@Controller
@RequestMapping("section")
public class SectionController {
    @Autowired    //创建实体后直接能使用getset
    private SectionService sectionService;
    @RequestMapping(value = {"/list", "/", ""})
    private String list(Model model, Section section) {
        List<Section> sectionList = sectionService.findList(section);
        model.addAttribute("sectionList", sectionList);
        return "section/list";
    }
    /**
     * 查询模块详情信息
     * @param model
     * @param id
     * @return
     */
    @RequestMapping("/get/{id}")
    private String get(Model model, @PathVariable Integer id) {
        Section section = sectionService.get(id);
        model.addAttribute("section", section);
        return "section/view";
    }
    /**
     * 删除模块
     * @param id
     * @param redirectAttributes
     * @return
     */
    @RequestMapping("/del/{id}")
    private String del(@PathVariable Integer id, RedirectAttributes redirectAttributes) {
        String msg = "删除失败";
        int successNum = sectionService.delete(id);
        if(successNum > 0) {
            msg = "成功删除" + successNum + "条记录";
        }
        redirectAttributes.addFlashAttribute("msg", msg);
        return "redirect:/section/list";
    }
}
