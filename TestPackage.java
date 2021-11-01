/**测试package关键字的作用，测试前我的想法是package会将编译后的点class文件放到当前目录下新建的package
 * 指定的目录下，对于点java文件没有影响?
 * 总结：使用package关键字并不会在指定的目录下自动创建点class文件，需要手动创建相应目录，将编译
 * 后的文件移动进去，否则执行后会报错.
 * 总结2：使用编译命令javac -d . 点java文件 可以自动在当前文件夹下创建package指定的包结构，java命令
 * 后跟的并不是文件名，而是跟着包名加点文件名，当点java文件中未使用package关键字指定该点java文件所在包
 * 时，即为默认包，可以直接使用java 文件名 执行该程序，当使用了package关键字，执行相应的程序则需要把
 * 包带上。
 * @author gzq
 * @version 2.0
 * @date 2021/10/30
 */
package qiang.zhong.gao;

public class TestPackage{
    public static void main(String[] args){
        System.out.println("here i am!");
    }
}