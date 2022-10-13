package p20221011;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author gzq
 * @version 1.0.0
 * 餐馆点菜系统
 */ 
public class Restaurant {
    public static void main(String[] args) {
        //定义一个食客
        Eater eater = new Eater();
        //获取终端输入
        Scanner scanner = new Scanner(System.in);
        //展示菜单
        FunctionMenu.showFunctionMenu();
        //点菜功能主体
        while(true){
            //获取食客的操作
            int operation = scanner.nextInt();
            //根据食客操作显示不同内容
            switch(operation){
                case 1:{
                    //点菜
                    //展示菜品菜单
                    DishMenu.showDishMenu();
                    //点菜
                    while(true){
                        //获取食客选择的菜品
                        int choice = scanner.nextInt();
                        //输入0退出点菜
                        if(choice == 0){
                            //展示功能菜单
                            FunctionMenu.showFunctionMenu();
                            break;
                        }
                        //switch(i){
                        //根据输入菜品的ID添加到已点菜品中
                        eater.addDish(DishMenu.dishes.get(choice - 1));
                            // case 1:{
                            //     eater.addDish(DishMenu.dishes.get(0));
                            //     break;
                            // }
                            // case 2:{
                            //     eater.addDish(DishMenu.dishes.get(1));
                            //     break;
                            // }
                            // case 3:{
                            //     eater.addDish(DishMenu.dishes.get(2));
                            //     break;
                            // }
                            // case 4:{
                            //     eater.addDish(DishMenu.dishes.get(3));
                            //     break;
                            // }
                            // case 5:{
                            //     eater.addDish(DishMenu.dishes.get(4));
                            //     break;
                            // }
                            // case 0:{
                            //     FunctionMenu.showFunctionMenu();
                            //     break;
                            // }
                        //}
                    }
                    break;
                }
                case 2:{
                    //展示已点菜品
                    eater.showOrder();
                    System.out.println("----------输入0返回主菜单-----------");
                    while(true){
                        //输入0返回主菜单
                        int choice2 = scanner.nextInt();
                        if(choice2 == 0){
                            FunctionMenu.showFunctionMenu();
                            break;
                        }
                    }
                    break;
                }
                case 3:{
                    //买单
                    eater.pay();
                    System.out.println("----------输入0返回主菜单-----------");
                    while(true){
                    //输入0返回主菜单
                        int choice3 = scanner.nextInt();
                        if(choice3 == 0){
                            FunctionMenu.showFunctionMenu();
                            break;
                        }
                    }
                    break;
                }
                case 0:
                break;
            }
            if(operation == 0){
                break;
            }
        }

        scanner.close();
    }
}

/**
 * 功能菜单
 */
class FunctionMenu{
    //功能菜单List集合
    public static List<Function> functionMenu = new ArrayList<Function>();

    //初始化功能菜单List集合
    static{
        Function function1 = new Function(1,"点菜");
        Function function2 = new Function(2,"已点菜品");
        Function function3 = new Function(3,"买单");
        functionMenu.add(function1);
        functionMenu.add(function2);
        functionMenu.add(function3);
    }

    //展示所有功能菜单
    public static void showFunctionMenu(){
        if(functionMenu.size() > 0){
            System.out.println("---------主菜单--------");
            for (Function function : functionMenu) {
                System.out.println(function.getFunctionId() + "\t\t" + function.getFunctionName());
            }
            System.out.println("-----------输入功能ID进入功能菜单输入0退出--------------");
        }
    }
}

/**
 * 餐馆提供功能
 */
class Function{
    //功能ID
    private int functionId;
    //功能名称
    private String functionName;

    /**
     * 功能构造器
     * @param functionId
     * @param functionName
     */
    public Function(int functionId,String functionName){
        this.functionId = functionId;
        this.functionName = functionName;
    }

    /**
     * 默认构造器
     */
    public Function(){}

    /**
     * @return 功能菜单ID
     */
    public int getFunctionId(){
        return this.functionId;
    }

    /**
     * 设置菜单ID
     * @param functionId
     */
    public void setFunctionId(int functionId){
        this.functionId = functionId;
    }

    /**
     * @return 功能菜单名称
     */
    public String getFunctionName(){
        return this.functionName;
    }

    /**
     * 设置菜单名称
     * @param functionName
     */
    public void setFunctionName(String functionName){
        this.functionName = functionName;
    }
}

/**
 * 菜品菜单
 */
class DishMenu{
    /**
     * 菜品集合
     */
    public static List<Dish> dishes = new ArrayList<Dish>();

    /**
     * 初始化菜品集合
     */
    static {
        Dish dish1 = new Dish(1,"红烧肉      ",new BigDecimal("39.9"));
        Dish dish2 = new Dish(2,"耗油生菜    ",new BigDecimal("9.9"));
        Dish dish3 = new Dish(3,"水煮鱼      ",new BigDecimal("39.9"));
        Dish dish4 = new Dish(4,"韭菜炒鸡蛋  ",new BigDecimal("19.9"));
        Dish dish5 = new Dish(5,"西红柿鸡蛋汤",new BigDecimal("19.9"));

        dishes.add(dish1);
        dishes.add(dish2);
        dishes.add(dish3);
        dishes.add(dish4);
        dishes.add(dish5);
    }

    //展示菜品菜单
    public static void showDishMenu(){
        if(dishes.size() > 0){
            System.out.println("可选菜品：");
            for (Dish dish : dishes) {
                System.out.println(dish.getDishId() + "\t\t" + dish.getDishName() + "\t\t" + dish.getDishPrice().toString() + " 元");
            }
            System.out.println("----------输入菜品ID点菜输入0退出-----------");
        }
    }
}

/**
 * 菜品
 */
class Dish{
    //菜品ID
    private int dishId;
    //菜品名称
    private String dishName;
    //菜品价格
    private BigDecimal dishPrice;

    /**
     * 菜品有参构造器
     * @param dishId
     * @param dishName
     * @param dishPrice
     */
    public Dish(int dishId,String dishName,BigDecimal dishPrice){
        this.dishId = dishId;
        this.dishName = dishName;
        this.dishPrice = dishPrice;
    }

    /**
     * 菜品无参构造器
     */
    public Dish(){
    }

    /**
     * @return 返回菜品ID
     */
    public int getDishId(){
        return this.dishId;
    }

    /**
     * 设置菜品ID
     * @param dishId
     */
    public void setDishId(int dishId){
        this.dishId = dishId;
    }

    /**
     * @return 菜品名称
     */
    public String getDishName(){
        return this.dishName;
    }

    /**
     * 设置菜品名称
     * @param dishName
     */
    public void setDishName(String dishName){
        this.dishName = dishName;
    }

    /**
     * @return 菜品价格
     */
    public BigDecimal getDishPrice(){
        return this.dishPrice;
    }

    /**
     * 设置菜品价格
     * @param dishPrice
     */
    public void setDishPrice(BigDecimal dishPrice){
        this.dishPrice = dishPrice;
    }
}

/**
 * 食客
 */
class Eater{
    //食客已点菜品集合
    private List<Dish> order = new ArrayList<Dish>();

    /**
     * 展示已点菜品
     */
    public void showOrder(){
        if(order.size() > 0){
            System.out.println("已点菜品：");
            for (Dish dish : order) {
                System.out.println(dish.getDishName() + "\t\t" + dish.getDishPrice() + " 元");
            }
        }else{
            System.out.println("未点任何菜品！！！！！！");
        }
    }

    /**
     * 食客点菜
     * @param dish
     */
    public void addDish(Dish dish){
        order.add(dish);
        System.out.println("点菜：" + dish.getDishName());
    }

    /**
     * 食客买单
     */
    public void pay(){
        showOrder();
        if(order.size() > 0){
            BigDecimal total = new BigDecimal("0");
            for(Dish dish : order){
                total = total.add(dish.getDishPrice()) ;
            }
            System.out.println("总共消费：" + total.toString() + " 元");
        }
        
    }
}