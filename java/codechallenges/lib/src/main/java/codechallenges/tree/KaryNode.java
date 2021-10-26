package codechallenges.tree;

import java.util.ArrayList;
import java.util.List;

public class KaryNode<T> {

  T value;
  List<KaryNode> nodes = new ArrayList<>();

  public KaryNode(T value) {this.value = value;}
}
