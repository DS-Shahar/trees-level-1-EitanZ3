class Main 
{
  public static boolean isgood(BinNode<Range> t)
	{
		if (!t.hasLeft()&&!t.hasRight())
		{
			return true;
		}
		if(t.hasLeft()&&!t.hasRight()&&t.getValue().getLow()==t.getLeft().getValue().getLow()&&t.getValue().getHigh()>=t.getLeft().getValue().getHigh())
		{
			return isgood(t.getLeft());
		}
		if(t.hasRight()&&t.hasLeft()&&t.getValue().getHigh()==t.getRight().getValue().getHigh()&&t.getValue().getLow()<=t.getRight().getValue().getLow())
		{
			return isgood(t.getRight());
		}
		if (t.hasLeft() && t.hasRight())
		{
			if (t.getLeft().getValue().getHigh() < t.getRight().getValue().getLow())
			{
				return isgood(t.getLeft()) && isgood(t.getRight());
			}
			return false;
		}
    return false;
	}
  }
}
