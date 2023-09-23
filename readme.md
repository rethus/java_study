### java 17: https://oracle.com/
### 编译
javac com.ecnu.demo.Main.java -> com.ecnu.demo.Main.class 文件
### 运行
java com.ecnu.demo.Main

java应用：
1. 桌面应用开发
2. 企业级应用开发（微服务，springcloud）
3. 移动应用开发（android，医疗设备）
4. 科学计算（matlab）
5. 大数据开发（hadoop）
6. 游戏开发（我的世界）

JDK：java开发工具包
JVM虚拟机：java程序运行的地方
核心类库：java写好的东西，直接调用
开发工具：

```java
import java.math.BigInteger;

class Test {
    public static void main(String[] args) {
        Integer a = Integer.MIN_VALUE; // 装箱
        int aa = a; // 拆箱
        Short b = 1.0;
        Byte c = Byte.MAX_VALUE;
        Long d = 1L;
        Character e = 'c';
        Boolean f = false;
        // 值比较用 equals(), 不用 ==
        BigDecimal g = new BigDecimal("1.0");
        BigInteger h = new BigInteger("1111");
    }
}
```
