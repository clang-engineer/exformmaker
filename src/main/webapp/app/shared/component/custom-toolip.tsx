import * as React from 'react';
import { styled } from '@mui/material/styles';
import Tooltip, { tooltipClasses, TooltipProps } from '@mui/material/Tooltip';

const CustomWidthTooltip = styled(({ className, ...props }: TooltipProps) => <Tooltip {...props} classes={{ popper: className }} />)({
  [`& .${tooltipClasses.tooltip}`]: {
    maxWidth: 500,
  },
});

const NoMaxWidthTooltip = styled(({ className, ...props }: TooltipProps) => <Tooltip {...props} classes={{ popper: className }} />)({
  [`& .${tooltipClasses.tooltip}`]: {
    maxWidth: 'none',
  },
});

export { CustomWidthTooltip, NoMaxWidthTooltip };
