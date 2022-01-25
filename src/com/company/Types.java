package com.company;

public enum Types {
    ADMIN(0),
    PREMIUM(1),
    AUTHORIZED(2),
    GUEST(3);

    private int order;

    private Types(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }
}

