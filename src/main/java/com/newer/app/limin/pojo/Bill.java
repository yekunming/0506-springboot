package com.newer.app.limin.pojo;

public class Bill {
    private int id;  //编号
    private String name; //收件人名字
    private String phone;//收件人电话
    private String address;//收件人地址
    private String sender;//发件人名字
    private String sname;//发件人手机
    private int status;//货单的状态

    public Bill() {
    }

    public Bill(int id, String name, String phone, String address, String sender, String sname, int status) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.sender = sender;
        this.sname = sname;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

	@Override
	public String toString() {
		return "Bill [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", sender=" + sender
				+ ", sname=" + sname + ", status=" + status + "]";
	}

}
