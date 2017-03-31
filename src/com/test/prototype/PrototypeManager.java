package com.test.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrototypeManager {
    /**
     * 记录原型和编号的对应关系
     */
    private static Map<String, Prototype> map = new HashMap<String, Prototype>();

    /**
     * 构造方法私有，避免外部创建实例
     */
    private PrototypeManager() {
    };

    /**
     * 向原型管理器添加或者修改某个原型的注册
     * szy
     * 2017年3月31日 下午1:20:30
     * @param prototypeId
     * @param prototype
     * void
     */
    public synchronized static void setPrototypr(String prototypeId, Prototype prototype) {
        map.put(prototypeId, prototype);
    }

    /**
     * 删除某个原型的注册 
     * szy
     * 2017年3月31日 下午1:21:22
     * @param prototyprId
     * void
     */
    public synchronized static void removePrototype(String prototyprId) {
        map.remove(prototyprId);
    }

    /**
     * 从原型管理器获得某个原型的注册 
     * szy
     * 2017年3月31日 下午1:21:40
     * @param prototypeId
     * @return
     * @throws Exception
     * Prototype
     */
    public synchronized static Prototype getPrototype(String prototypeId) throws Exception {
        Prototype prototype = map.get(prototypeId);
        if (prototype == null) {
            throw new Exception("您获取的原型没有注册或者已经别销毁！");
        }
        return prototype;
    }
}
