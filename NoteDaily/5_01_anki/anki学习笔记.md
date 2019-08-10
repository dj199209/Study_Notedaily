## 插件
### 快速切换笔记颜色,加粗
- Quick Colour Changing(2491935955)作废--
- editor: apply font color, background color, custom class, custom style(1899278645)

```config.json
{
    "v2": [
        {
            "Category": "backcolor",
            "Hotkey": "Alt+shift+y",
            "Setting": "#ffff00",
            "Show_in_menu": true,
            "Text_in_menu": "background yellow",
            "extrabutton_show": true,
            "extrabutton_text": "Ye",
            "extrabutton_tooltip": "background yellow"
        },
        {
            "Category": "backcolor",
            "Hotkey": "Alt+shift+g",
            "Setting": "#00ff00",
            "Show_in_menu": true,
            "Text_in_menu": "background green",
            "extrabutton_show": false,
            "extrabutton_text": "Gr",
            "extrabutton_tooltip": "background green"
        },
        {
            "Category": "backcolor",
            "Hotkey": "Alt+shift+b",
            "Setting": "#00ffff",
            "Show_in_menu": true,
            "Text_in_menu": "background blue",
            "extrabutton_show": false,
            "extrabutton_text": "bl",
            "extrabutton_tooltip": "background blue"
        },
        {
            "Category": "backcolor",
            "Hotkey": "Alt+shift+r",
            "Setting": "#fd9796",
            "Show_in_menu": true,
            "Text_in_menu": "background red",
            "extrabutton_show": false,
            "extrabutton_text": "Re",
            "extrabutton_tooltip": "background red"
        },
        {
            "Category": "forecolor",
            "Hotkey": "Alt+g",
            "Setting": "#00aa00",
            "Show_in_menu": true,
            "Text_in_menu": "font-color green",
            "extrabutton_show": false,
            "extrabutton_text": "fG",
            "extrabutton_tooltip": "font-color green"
        },
        {
            "Category": "forecolor",
            "Hotkey": "Alt+b",
            "Setting": "#0000ff",
            "Show_in_menu": true,
            "Text_in_menu": "font-color blue",
            "extrabutton_show": false,
            "extrabutton_text": "fB",
            "extrabutton_tooltip": "font-color blue"
        },
        {
            "Category": "forecolor",
            "Hotkey": "Alt+r",
            "Setting": "#ff0000",
            "Show_in_menu": true,
            "Text_in_menu": "font-color red",
            "extrabutton_show": false,
            "extrabutton_text": "fR",
            "extrabutton_tooltip": "font-color red"
        },
        {
            "Category": "style",
            "Hotkey": "alt+shift+w",
            "Setting": "font-family: sans; font-size: smaller;",
            "Show_in_menu": true,
            "Text_in_menu": "sans serif font",
            "Text_in_menu_styling": "font-family:sans; font-size: smaller;",
            "extrabutton_show": true,
            "extrabutton_text": "FO",
            "extrabutton_tooltip": "sans serif fonts"
        },
        {
            "Category": "class",
            "Hotkey": "Alt+shift+q",
            "Setting": "class1",
            "Show_in_menu": true,
            "Text_in_menu": "important (class1)",
            "Text_in_menu_styling": "color: magenta;font-style: italic;font-family:monospace;",
            "extrabutton_show": true,
            "extrabutton_text": "c1",
            "extrabutton_tooltip": "apply class1",
            "extrabutton_width": false
        }
    ],
    "v2_configwarning": true,
    "v2_key_styling_menu": "F2",
    "v2_menu_styling": true,
    "v2_show_in_contextmenu": true,
    "v2_wider_button_in_menu": true
}
  ```
### 快速切换笔记模板
- Quick note and deck buttons (Fork for 2.1)1331140127
- 快捷键
`ctrl+1------B`
`ctrl+2------C`
`ctrl+3------b`
`ctrl+4------c`
`ctrl+5------I`
```配置文件
{
    "deck_button_rows": [
        [
            {
                "label": "Deck1",
                "name": "Deck1",
                "shortcut": "Ctrl+7"
            },
            {
                "label": "my subdeck",
                "name": "Deck1::my subdeck"
            }
        ],
        [
            {
                "label": "Deck 2",
                "name": "Deck 2"
            }
        ]
    ],
    "model_button_rows": [
        [
            {
                "label": "B",
                "name": "Basic（高阶版）",
                "shortcut": "Ctrl+1"
            },
            {
                "label": "C",
                "name": "Cloze（高阶版）",
                "shortcut": "Ctrl+2"
            },
            {
                "label": "b",
                "name": "Basic（简化版）",
                "shortcut": "Ctrl+3"
            },
            {
                "label": "c",
                "name": "Cloze（简化版）",
                "shortcut": "Ctrl+4"
            },
            {
                "label": "I",
                "name": "IRead",
                "shortcut": "Ctrl+5"
            }
        ],
        [
            {
                "label": "with reverse",
                "name": "Basic (and reversed card)",
                "shortcut": "Ctrl+3"
            }
        ]
    ]
```
### 补充插件
- supplementary buttons anki (旧)
- power format pack(旧)--可以使用markdown
- mini format pack(295889520)
###  Image Occlusion Enhanced for Anki 2.1 (alpha)
- 图片卡片制作
- 1374772155