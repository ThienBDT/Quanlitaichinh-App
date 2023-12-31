package com.example.quanlythuchi_app.Container.Response;


import com.example.quanlythuchi_app.Model.UserModel;

public class LoginResponse {
    private boolean status;
    private String message;
    private String accessToken;

    private String expiresIn;
    private String refreshToken;
    private LoginResponse.UserInfoModel userInfoModel;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }

    public LoginResponse.UserInfoModel getUserInfoModel() {
        return userInfoModel;
    }

    public void setUserInfoModel(LoginResponse.UserInfoModel userInfoModel) {
        this.userInfoModel = userInfoModel;
    }

    public static class UserInfoModel {
        private int id;
        private String firstname;
        private String lastname;
        private String date;
        private String avatar;
        private LoginResponse.UserInfoModel.AccountModel accountModel;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public LoginResponse.UserInfoModel.AccountModel getAccountModel() {
            return accountModel;
        }

        public void setAccountModel(LoginResponse.UserInfoModel.AccountModel accountModel) {
            this.accountModel = accountModel;
        }

        // Các getter và setter ở đây

        public static class AccountModel {
            private int id;
            private String username;
            private String password;
            private String email;
            private LoginResponse.UserInfoModel.AccountModel.RoleModel roleModel;
            private boolean activity;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public LoginResponse.UserInfoModel.AccountModel.RoleModel getRoleModel() {
                return roleModel;
            }

            public void setRoleModel(LoginResponse.UserInfoModel.AccountModel.RoleModel roleModel) {
                this.roleModel = roleModel;
            }

            public boolean isActivity() {
                return activity;
            }

            public void setActivity(boolean activity) {
                this.activity = activity;
            }

            public static class RoleModel {
                private int id;
                private String name;

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
            }
        }
    }

    @Override
    public String toString() {
        return "LoginResponse{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", accessToken='" + accessToken + '\'' +
                ", expiresIn='" + expiresIn + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                '}';
    }
}
