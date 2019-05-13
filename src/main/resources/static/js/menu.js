var template = Handlebars.compile('{{>menu}}');
var data = {
    menu: {
        "className": "am-no-layout",
        "options": {
            "className": "am-active",
            "cols": "1"
        },
        "content": [
            {
                "link": "##",
                "title": "双色球"
            },
            {
                "link": "##",
                "title": "大乐透"
            },
            {
                "link": "##",
                "title": "七星彩"
            }
        ],
        "theme": "offcanvas1"
    }
};

var html = template(data.menu);
$('body').append(html);