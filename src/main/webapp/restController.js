
function loadPageWithGetData(url, template){
    fetch(url)
        .then(function(res){
            console.log(res);
            if (res.status ===200)
            {
                res.json()
                    .then(function (json) {
                        console.log(json);
                        fetch(template).then(function (templateresp) {
                            templateresp.text().then(function (template) {
                                var html = Mustache.render(template, json);
                                console.log(html);
                                document.getElementById("maincontainer").innerHTML = html;
                            });
                        });
                    });
            } else {
                res.json()
                    .then(function(msg){
                        alert(msg);
                    });
            }
        });
}

function loadPageWithPostData(url, template, json){
    console.log(json);
    fetch(url, {
            method:'post',
            body:JSON.stringify(json),
            headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'}
        })
        .then(function(res){
            console.log(res);
            if (res.status ===200)
            {
                res.json()
                    .then(function (json) {
                        console.log(json);
                        fetch(template).then(function (templateresp) {
                            templateresp.text().then(function (template) {
                                var html = Mustache.render(template, json);
                                console.log(html);
                                document.getElementById("maincontainer").innerHTML = html;
                            });
                        });
                    });
            } else {
                res.json()
                    .then(function(json){
                        alert(json.msg);
                    });
            }
        });
}

function loadPageWithDeleteData(url, template){
    fetch(url, {method:'delete'})
        .then(function(res){
            console.log(res);
            if (res.status ===200)
            {
                res.json()
                    .then(function (json) {
                        console.log(json);
                        fetch(template).then(function (templateresp) {
                            templateresp.text().then(function (template) {
                                var html = Mustache.render(template, json);
                                console.log(html);
                                document.getElementById("maincontainer").innerHTML = html;
                            });
                        });
                    });
            } else {
                res.json()
                    .then(function(msg){
                        alert(msg);
                    });
            }
        });
}