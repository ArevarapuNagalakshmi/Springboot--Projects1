package com.Pen.Pens.Services;

import com.Pen.Pens.Dto.PenDto;
import com.Pen.Pens.Entity.PenEntity;

public interface PenServices {
    PenDto savePen(PenDto penDto);
    PenDto getPen(int id);
    PenDto updatePen(int id,PenDto penDto);
    PenEntity deletePen(int id);

}
