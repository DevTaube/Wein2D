package wein2d;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseManager extends MouseAdapter
{
    // Variables ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    protected int mouseX = 0;
    protected int mouseY = 0;
    protected boolean mouseButtonL = false;
    protected boolean mouseButtonR = false;
    // MouseMoved ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void mouseMoved(MouseEvent e)
    {
      mouseX = e.getX();
      mouseY = e.getY();
    }
    // MousePressed ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void mousePressed(MouseEvent e)
    {
      if(e.getButton() == 1)
      {
          mouseButtonL = true;
      }
      if(e.getButton() == 3)
      {
          mouseButtonR = true;
      }
    }
    // MouseReleased ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void mouseReleased(MouseEvent e)
    {
      if (e.getButton() == 1)
      {
          mouseButtonL = false;
      }
      if (e.getButton() == 3)
      {
          mouseButtonR = false;
      }
    }
}