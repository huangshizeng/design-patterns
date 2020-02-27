package com.huang.buildermode;

/**
 * @author hsz
 * @data 2020/2/27 13:43:49
 */
public class Contract {

    private Contract(Builder builder) {
        this.param1 = builder.param1;
        this.param2 = builder.param2;
        this.param3 = builder.param3;
    }

    private Integer param1;
    private Integer param2;
    private Integer param3;

    public Integer getParam1() {
        return param1;
    }

    public Integer getParam2() {
        return param2;
    }

    public Integer getParam3() {
        return param3;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "param1=" + param1 +
                ", param2=" + param2 +
                ", param3=" + param3 +
                '}';
    }

    public static class Builder {
        private Integer param1;
        private Integer param2;
        private Integer param3;

        public Builder setParam1(Integer param1) {
            // 校验逻辑
            this.param1 = param1;
            return this;
        }

        public Builder setParam2(Integer param2) {
            // 校验逻辑
            this.param2 = param2;
            return this;
        }

        public Builder setParam3(Integer param3) {
            // 校验逻辑
            this.param3 = param3;
            return this;
        }

        public Contract build() {
            // 校验逻辑
            return new Contract(this);
        }
    }
}
