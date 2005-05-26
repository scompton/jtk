/****************************************************************************
Copyright (c) 2004, Colorado School of Mines and others. All rights reserved.
This program and accompanying materials are made available under the terms of
the Common Public License - v1.0, which accompanies this distribution, and is 
available at http://www.eclipse.org/legal/cpl-v10.html
****************************************************************************/
package edu.mines.jtk.sgl;

import java.util.*;

/**
 * A transform context for view frustum culling.
 * @author Dave Hale, Colorado School of Mines
 * @version 2005.05.21
 */
public class CullContext extends TransformContext {

  public void add(Node node) {

  }

  private DrawList _drawList;
  private ArrayList<Node> _nodes;
}
