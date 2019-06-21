#CRvim vim 学习笔记

### tt 
显示目录结构
### 找变量 
回车定位到函数
### 代码补全
自动打开使用文档vim
### markdown书写
- 打开实时预览`r`
### vim的常用
`i`写入模式光标前一个字符
`shift+i`就是大写`I`快速进入行首写入模式
`a`后一个字符
`shift+a`就是大写`A`快速定位到行尾进入写入模式
`o`换行插入进入写入模式
`shift+o`就是大写`O`上一行插入一行进入写入模式
`ESC`退出模式
### 方向选择
`h`左
`j`下
`k`上
`l`右
#### 普通模式
`:w`保存
`:q`退出
### vimrc配置文件
`noremap`修改键位 
```vimrc
noremap n h
noremap u k 
noremap e j
noremap i l
noremap k i
noremap l u
noremap K I
```
`设置快捷输入方式map`
`<CR>` 回车
```vimrc
map s <nop> #小写s设置为无效
map S :w<CR>   #大写S设置为保存
map Q :q<CR>
map R :source $MYVIMRC #重新加载配置文件
systax on  #打开高亮
```
`set number`打开行号_并且保存后重新加载
 `set norelativenumber` 
 `set relativenumber` 当前行下数多少行
`set cursorline` 显示一根线
`set wrap`自动换行
`set showcmd`显示输入内容
`set wildmenu` 开启选择菜单
### 操作与动作
<operation>+<motion>
#### 删除(剪切)_操作
- `d`+左向左删除
- `d`+右向右删除一个字符
- `d+d`2下d对一行进行删除 剪切
#### 粘贴`p`_操作

#### 复制`y`_操作

#### 改变删除后进入写入`c`_操作
- `c` change
- `c+w`删除一个单词进入写入模式
- `c+i+w`把这个词中的单词改掉change in word 
- 
#### `w`_动作word
#### `i`_in
例子
```vimrc
"some text in quotation marks"
<some text in quotation markcis>

```
删除引号内文字进入写入模式`c + i +"`
复制双引号内的内容 `y+i+"`
删除双引号内的内容不进入写入模式`d+i+"`
#### `f`动作find
```vim
This is vim :best editor out there.
```
`f+v`去找v开头的单词
`df:`一直删到冒号
`cf:`一直删到冒号并进入写入模式
`yF:`复制寻找冒号
### 搜索
`/map`搜索map
高亮搜索`hlsearch`
变搜边高亮`set incsearch`
`exec nohlsearch`:后输入的指令
`set ignorecase`忽略大小写搜索
`set smartcase`
`noremap = n`搜索上翻页
`noremap - N`搜索下翻页
#### 设置leader键
`let mapleader=" "`+`noremap <LEADER><CR> :nohlsearch<CR> `
`:color `美化vim
vim 插件安装
`vim-plug`vim的插件管理器
https://github.com/junegunn/vim-plug

```vimrc
安装插件
call plug#begin('~/.vim/plugged')    //开始

plug '想装的插件'

call plug#end()  //结束
```
`:pluginstall`按下tab自动补全
插件推荐:
1. vim-airline(plug 'vim-airline/vim-airline')底端显示
   `https://github.com/vim-airline/vim-airline`复制gittub后的地址为安装地址
2.vim-snazzy vim(plug 'connorholyday/vim-snazzy')配色  
`https://github.com/connorholyday/vim-snazzy`
