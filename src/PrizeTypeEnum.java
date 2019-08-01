public enum PrizeTypeEnum {

    //虚拟奖品
    VIRTUAL("0", "Virtual", "虚拟奖品"),
    //实物奖品
    REAL("1", "Real", "实物奖品"),
    //实物奖品
    JF("2", "Jf", "积分"),
    //优惠券
    COUPON("3", "Coupon", "优惠券"),
    //提额包
    AMOUNT("4", "Amount", "提额包"),
    //话费充值
    PREPAID("5", "Amount", "话费充值"),
    //现金红包
    CASH("6", "Cash", "现金红包"),
    //不定额积分(用于比赛等结算)
    OPEN_JF("7", "OpenJf", "不定额积分(用于比赛等结算)"),
    //优惠券包奖励
    CAMPAIGN("8", "Campaign", "优惠券包奖励"),
    //话费直冲
    FEE_RECHARGE("9", "FeeRecharge", "话费直充");

    /**
     * 奖品类型
     */
    private String prizeType;
    /**
     * 奖品类型名称
     */
    private String prizeTypeName;

    /**
     * 奖品类型描述
     */
    private String description;

    PrizeTypeEnum(String prizeType, String prizeTypeName, String description) {
        this.prizeType = prizeType;
        this.prizeTypeName = prizeTypeName;
        this.description = description;
    }


    public String getPrizeType() {
        return prizeType;
    }

    public String getPrizeTypeName() {
        return prizeTypeName;
    }

    public String getDescription() {
        return description;
    }

}
