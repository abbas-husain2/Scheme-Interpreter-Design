//
// Generated by JTB 1.3.2
//

package syntaxtree;

/**
 * Grammar production:
 * f0 -> IntegerLiteral()
 *       | TrueLiteral()
 *       | FalseLiteral()
 *       | Identifier()
 *       | ListExpr()
 *       | PlusExpression()
 *       | MinusExpression()
 *       | MultiplyExpression()
 *       | DivideExpression()
 *       | GTExpression()
 *       | LTExpression()
 *       | EQExpression()
 *       | IfExpression()
 *       | DefineExpression()
 *       | Assignment()
 *       | ProcedureExp()
 *       | CarExpr()
 *       | CdrExpr()
 *       | Application()
 */
public class Expression implements Node {
   public NodeChoice f0;

   public Expression(NodeChoice n0) {
      f0 = n0;
   }

   public void accept(visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}

