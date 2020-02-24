package example.controller;

import com.jodo.Account;
import com.jodo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "/firstController")
@SessionAttributes(value = {"mail"})
public class springMVCFirstController {
   /*method请求方式必须为get，必须带有name和age两个参数，且age不能等于12*/
    @RequestMapping(value = "/helloWorld",method = RequestMethod.GET,params = {"name","age!=12"})
    public String SpringMVCFirstController(){
        System.out.println("HelloWold进来了");
        return "helloWorld";
    }
    /*
    * 访问的url/值
    *
    * 使用占位符{}
    * */
    @RequestMapping(value = "/zhanweifu/{id}")
    public String zhanweifu(@PathVariable(value = "id") int id){
        System.out.println("占位符使用成功"+id);
        return "helloWorld";
    }
    /*
    * rest风格get
    *
    * GET POST DELETE PUT
    * */
    @RequestMapping(value = "/testGet",method =RequestMethod.GET)
    public String testGet(){
        System.out.println("测试GET请求成功");
        return  "helloWorld";
    }
    /*
     * rest风格post
     *
     * GET POST DELETE PUT
     * */
    @RequestMapping(value = "/testPost/{id}",method = RequestMethod.POST)
    public String testPost(@PathVariable(value = "id") Integer id ){
        System.out.println("正在插入id值为"+id+"的数据");
        return  "helloWorld";
    }

    /*
     * rest风格Delete
     *
     * GET POST DELETE PUT
     * */
    @RequestMapping(value = "/testDelete/{id}",method = RequestMethod.DELETE)
    public String testDelete(@PathVariable(value = "id") Integer id ){
        System.out.println("正在删除id值为"+id+"的数据");
        return "helloWorld";
    }

    /*
     * rest风格Put
     *
     * GET POST DELETE PUT
     * */
    @RequestMapping(value = "/testPut/{id}",method = RequestMethod.PUT)
    public String testPut(@PathVariable(value = "id") Integer id ){
        System.out.println("正在更新id值为"+id+"的数据");
        return "helloWorld";
    }

    /*
     * @RequestParam(value="请求的参数")
     * 如果形参的名字和我们请求的参数一致，则可以省略RequestParam
     *如果不一致必须加上@RequestParam(value="")
     *required=true 上送参数里面必须包含id 这个参数
     * */
    @RequestMapping(value = "/testRequestparam")
    public String tesRequestparam(@RequestParam(value = "id",required = false) Integer a,@RequestParam(value = "name") String b ){
//    public String tesRequestparam(Integer id,String name ){
        System.out.println(a);
        System.out.println(b);
        return "helloWorld";
    }
    /*
    *pojo
     *
      *  */
    @RequestMapping(value = "/testPojo")
    public String testPojo(User user){
        System.out.println(user);
        return "helloWorld";
    }

    /*
    * @RequestHeader
    * 使用该注解获取报文头中的信息
    * */
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader("Host") String  a,@RequestHeader("User-Agent") String b){
        System.out.println(a);
        System.out.println(b);
        return "helloWorld";
    }

    /*
    * ModelAndView
    *
    *
    * */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("helloWorld");
        mv.addObject("name","jiao");
        Map<String,Object > map = new HashMap<>();
        map.put("age","18");
        map.put("sex","boy");
        mv.addAllObjects(map);
        return mv;
    }
    /*
    * 形参中加入map
    * 可以在view视图中取到
    * */
    @RequestMapping("/testMap")
    public String testMap(Map<String,Object> map){
        map.put("age","222");
        return "helloWorld";
    }

    /*
     * 形参中加入model
     * 可以在view视图中取到
     * */
    @RequestMapping("/testModel")
    public String testMap(Model model){
        model.addAttribute("city","taishan");
        return "helloWorld";
    }

    /*
    * 形参中加入ModelMap
    * 可以在view视图中取到
    *
    * */
    @RequestMapping("/testModelMap")
    public String testModelMap(ModelMap modelMap){
        modelMap.addAttribute("mail","110@qq.com");
        return "helloWorld";
    }
    /*
    * result
    * SessionAttribute 要求放置的值必须放置在模型数据里面
    *
    * */
    @RequestMapping("/result")
    public String testResult(){
        return "result";
    }
    /*
    * ModelAttibute
    *执行其他之前，先会执行这个业务方法
    * 无返回值方法
    * */
   /* @ModelAttribute
    public void start(Map<String,Object> map){
        Account account  = new Account("Tom","111","2016-1-1");
        map.put("abc",account);
    }*/
    /*
     * ModelAttibute
     *执行其他之前，先会执行这个业务方法
     * 有返回值方法
     * 返回account对象
     *
     * */
   /* @ModelAttribute
    public Account start(){
        Account account  = new Account("Tom","111","2016-1-1");
        return account;
    }*/
   @ModelAttribute(value = "abc")
   public Account start(){
        Account account = new Account("Tom","111","20181111");
        return account;
   }

    /*
    * jiaofc
    *
    * ModelAttribute
    * */
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc") Account account){
        System.out.println(account);
        return "helloWorld";
    }

    @RequestMapping("/testGlobal")
    public String textGlobal(){
        return "abc";
    }

}
