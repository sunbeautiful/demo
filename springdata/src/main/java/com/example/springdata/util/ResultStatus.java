//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.example.springdata.util;

public enum ResultStatus {
    ERROR("error"),
    WARNING("warning"),
    SUCCESS("success");

    String status;

    private ResultStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }
}
