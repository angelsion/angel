(function($) {
  'use strict';

  $(function() {
    var $fullText = $('.admin-fullText');
    $('#admin-fullscreen').on('click', function() {
      $.AMUI.fullscreen.toggle();
    });

    $(document).on($.AMUI.fullscreen.raw.fullscreenchange, function() {
      $fullText.text($.AMUI.fullscreen.isFullscreen ? '退出全屏' : '开启全屏');
    });

    var template = Handlebars.compile('{{>menu}}');
    var data = {
      menu: {
        "options": {
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
  });
})(jQuery);
