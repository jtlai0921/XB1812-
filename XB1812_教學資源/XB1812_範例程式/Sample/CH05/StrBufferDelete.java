public class StrBufferDelete {
  public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("Java�{���m��");
    sb.delete(4, 6); //�R����4�r����Ĥ��r�����e�����e

    System.out.println(sb);
    sb.delete(0,sb.length());//�R���q��0�}�l�A���ƪ��`��
    System.out.println(sb); //�S����ơA�]�������R���F

    sb.append("Java�{�����m��"); //���s���w���
    sb.deleteCharAt(6); //�R���Ĥ��r�������e
    System.out.println(sb);
  }
}
