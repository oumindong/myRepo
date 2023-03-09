package singleton;

import okhttp3.OkHttpClient;

/**
 * @author oumd
 * @date 2023/3/9
 */
public class OkhttpUtil {

    private OkhttpUtil() {
    }

    /**
     * 返回实例
     */
    public static OkHttpClient getOkHttpClient() {
        return OkhttpUtilEnum.INSTANCE.getInstance();
    }

    /**
     * 使用枚举方法实现单例模式
     */
    private enum OkhttpUtilEnum {
        /**
         * 内部枚举类
         */
        INSTANCE;

        private OkHttpClient instance;

        /**
         * JVM保证这个方法绝对只调用一次
         */
        OkhttpUtilEnum() {
            System.out.println("加载次数加1");
            instance = new OkHttpClient();
        }

        public OkHttpClient getInstance() {
            return instance;
        }
    }

}
