$(document).ready($(".test1").click(function(){
    alert("hhh");
    $.post("myservlet",
        {
            name : "myname"
        },
        function (data,state){
            alert(data);
            alert(state);
        });
}));


