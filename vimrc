call plug#begin('~/.vim/plugged')

Plug 'scrooloose/nerdtree', { 'on':  'NERDTreeToggle' }
Plug 'Valloric/YouCompleteMe'
Plug 'jiangmiao/auto-pairs'
Plug 'tpope/vim-fugitive'
Plug 'airblade/vim-gitgutter'
Plug 'ctrlpvim/ctrlp.vim'
Plug 'easymotion/vim-easymotion'

"colorschemes
Plug 'morhetz/gruvbox'

call plug#end()

set number
set tabstop=4
syntax on
let g:mapleader='\'
colorscheme gruvbox
set background=dark

set hlsearch
set incsearch

" mappings

map <C-n> :NERDTreeToggle<CR>
map <Leader> <Plug>(easymotion-prefix)
"vimawsom.com a lot of plugins
" YouCompileMe wrongFolder. you need .vim/plugged/YouCompleteMe instead 
