public static List<String> cavityMap(List<String> grid) {
        List<String> grid_ = new ArrayList<>();
        grid_.addAll(grid);
        for(int i = 1;i<grid.size()-1;i++){
          for(int j = 1;j<grid.get(i).length()-1;j++){
              if((Integer.valueOf(grid.get(i).charAt(j)+"")>Integer.valueOf(grid.get(i).charAt(j+1)+"")) && (Integer.valueOf(grid.get(i).charAt(j)+"")>Integer.valueOf(grid.get(i).charAt(j-1)+"")) && (Integer.valueOf(grid.get(i).charAt(j)+"")>Integer.valueOf(grid.get(i+1).charAt(j)+"")) && (Integer.valueOf(grid.get(i).charAt(j)+"")>Integer.valueOf(grid.get(i-1).charAt(j)+"")))
                {
                    grid_.set(i, grid_.get(i).substring(0,j)+"X"+grid_.get(i).substring(j+1,grid_.get(i).length()));
                }
            }
        }
        return grid_;
}
