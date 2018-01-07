

$(document).ready(function() {
    function  a() {

            console.log("clicked");
            $.ajax({
                type : "GET",
                url : window.location + "word/all",
                success: function(result){
                    $s = "";
                    $.each(result, function (i, word) {
                        $s += word["word"];
                        $s += " ";

                    })
                    console.log("Success: ", result);
                    $("#wo").text($s);

                },
                error : function(e) {
                    console.log("ERROR: ", e);
                }
            });

     }
    window.setInterval(function(){
            a();
    }, 500);

});