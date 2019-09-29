new Vue({
    el: "#app",
    data: {
        user: {id: "", username: "", password: "", age: "", sex: "", email: ""},
        userList: []
    },
    methods: {
        findAll: function () {
            axios.get("/user/findAll.do").then(function (response) {
                this.data.userList = response.data;
                console.log(this.data.userList);
            }).catch(function (err) {
                console.log(err);
            });
        },

        findById: function (id) {

            console.log(1234546445664);
            var _this = this;
            axios.get("/vuejsDemo/user/findById.do", {params: {id: userid}}).then(function (response) {
                _this.user = response.data;
                $('#myModal').modal("show");
            }).catch(function (err) {
            });


            $("#myModal").modal("show");

        },
        update: function (user) {
            var _this = this;
            axios.post("/vuejsDemo/user/update.do", _this.user);
        }

    },
    created: function () {
        this.findAll();
    }
});