/*
 * Copyright OpenSearch Contributors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.opensearch.sql.ast.expression;

import org.opensearch.sql.ast.AbstractNodeVisitor;

import java.util.Arrays;
import java.util.List;

/** Expression node of the logic XOR. */

public class Xor extends BinaryExpression {
  private UnresolvedExpression left;
  private UnresolvedExpression right;

  public Xor(UnresolvedExpression left, UnresolvedExpression right) {
    super(left,right);
  }
  
  @Override
  public <R, C> R accept(AbstractNodeVisitor<R, C> nodeVisitor, C context) {
    return nodeVisitor.visitXor(this, context);
  }
}
