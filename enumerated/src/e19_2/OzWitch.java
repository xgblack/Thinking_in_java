package e19_2;

/**
 * @author 小光
 * @date 2019/10/9 16:48
 * className: OzWitch
 * description:
 * ***************************************************************************
 * Copyright(C),2018-2019,https://blog.xgblack.cn  .All rights reserved.
 * ***************************************************************************
 */
public enum  OzWitch {
    WEST("Miss Gulch, aka the Wicked Witch of the West"),
    NORTH("Glinda, the Good Witch of the North"),
    EAST("Wicked Witch of the East, wearer of the Ruby Slippers,crushed by Dorothy's house"),
    SOUTH("Good by inference, but missing");

    private String description;

    private OzWitch(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public static void main(String[] args) {
        for (OzWitch witch : OzWitch.values()) {
            System.out.println(witch + ": " + witch.getDescription());
        }
    }
}
